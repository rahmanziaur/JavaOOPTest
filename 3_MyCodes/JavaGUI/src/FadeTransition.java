import java.awt.*;
import java.awt.image.*;
public class FadeTransition extends BillTransition {
    private static final int CELLS = 7;
    private static final int MULTIPLIER = 0x5D1E2F;
    private static short[][] createRandomArray(int number_pixels,
                                               int cell_h) {
        int total_cells = CELLS + 1;
        int new_pixels_per_cell = number_pixels / total_cells;
        short[][] random = new short[total_cells][new_pixels_per_cell];
        int random_count[] = new int[total_cells];
        for(int s = 0; s < total_cells; ++s) {
            random_count[s] = 0;
        }
        int cell;
        int rounded_new_pixels_per_cell =
                new_pixels_per_cell * total_cells;int seed = (int)System.currentTimeMillis();
        int denominator = 10;
        while((new_pixels_per_cell % denominator > 0 ||
                cell_h % denominator == 0) && denominator > 1) {
            --denominator;
        }
        int new_randoms_per_cell = new_pixels_per_cell / denominator;
        int new_randoms = rounded_new_pixels_per_cell / denominator;
        for(int p = 0; p < new_randoms_per_cell; ++p) {
            seed *= MULTIPLIER;
            cell = (seed >>> 29);
            random[cell][random_count[cell]++] = (short)p;
        }
        seed += 0x5050;
        try { Thread.sleep(150); } catch (InterruptedException e) {}
        for(int p = new_randoms_per_cell; p < new_randoms; ++p) {
            seed *= MULTIPLIER;
            cell = (seed >>> 29);
            while(random_count[cell] >= new_randoms_per_cell) {
                if(++cell >= total_cells) {
                    cell = 0;
                }
            }
            random[cell][random_count[cell]++] = (short)p;
        }
        for(int s = 0; s < CELLS; ++s) {
            for(int ps = new_randoms_per_cell; ps < new_pixels_per_cell;
                ps += new_randoms_per_cell) {
                int offset = ps * total_cells;
                for(int p = 0; p < new_randoms_per_cell; ++p) {
                    random[s][ps + p] = (short)(random[s][p] + offset);
                }
            }try { Thread.sleep(50); } catch (InterruptedException e) {}
        }
        random[CELLS] = null;
        return random;
    }
    public void init(Component owner, int[] current, int[] next) {
        init(owner, current, next, CELLS);
        System.arraycopy(current_pixels, 0, work_pixels,
                0, pixels_per_cell);
        short random[][] = (short[][])object_table.get(
                getClass().getName() + pixels_per_cell);
        if(random == null) {
            random = createRandomArray(pixels_per_cell, cell_h);
            object_table.put(getClass().getName() + pixels_per_cell,
                    random);
        }
        for(int c = 0; c < CELLS; ++c) {
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            int limit = random[c].length;
            for(int p = 0; p < limit; ++p) {
                int pixel_index = random[c][p];
                work_pixels[pixel_index] = next_pixels[pixel_index];
            }
            try { Thread.sleep(50); } catch (InterruptedException e) {}
            createCellFromWorkPixels(c);
        }
        work_pixels = null;
    }
}