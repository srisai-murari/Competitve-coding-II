mport java.util.Scanner;
class DiskTower {
    static void arrangeDisks(int[] disks, int n) {
        int max = n;
        System.out.println("\nDisk Placement Process:");
        for (int i = 0; i < n; i++) {
            System.out.print("Day " + (i + 1) + " -> ");
            if (disks[i] == max) {
                while (max >= 1) {
                    boolean found = false;
                    for (int j = 0; j <= i; j++) {
                        if (disks[j] == max) {
                            System.out.print(max + " ");
                            max--;
                            found = true;
                            break;
                        }
                    }
                    if (!found) break;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int n = sc.nextInt();
        int[] disks = new int[n];
        System.out.println("Enter disk sizes (one per day):");
        for (int i = 0; i < n; i++) {
            disks[i] = sc.nextInt();
        }
        arrangeDisks(disks, n);
    }
}
