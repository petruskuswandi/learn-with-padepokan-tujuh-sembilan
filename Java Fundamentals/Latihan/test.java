class JatisSolution {
    public int[] solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int complement = target - nums[i];
                if (nums[j] == complement)
                    return new int[] {i, j};
            }
        }
        throw new IllegalArgumentException("No Data");
    }

    public static void main(String[] args) {
        //Inisiasi masukkan
        int[] nums = {4, 5, 6, 7};
        int target = 10;

        // Memanggil fungsi solution
        /*Memanggil metode solution(nums, target) untuk mencari pasangan angka dalam array nums yang jika dijumlahkan akan menghasilkan nilai target.*/
        JatisSolution jatis = new JatisSolution();
        int[] result = jatis.solution(nums, target);

        for (int i = 0; i < result.length; i++) {
            System.out.print("indexnya: " + result[i] + " nilainya: " + nums[result[i]] + "\n");
        }

        System.out.println("targetnya: " + target);
    }
}

//Penjelasan Perulangan
/*Untuk i = 0
* maka di perulangan untuk j = 0
* nilai complement = 10 - 4 = 6
* komputer akan terus berulang sehingga menemukan jika nums[j] == 6 dimana j = 2 nums[2] == 6 maka mengembalikan nilai index array yang baru
* yaitu int[] {i, j} = 0, 2
 */
