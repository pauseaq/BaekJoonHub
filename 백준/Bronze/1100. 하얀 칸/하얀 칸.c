#include <stdio.h>

int main() {
    char chess[8][8];
    int count = 0;
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            scanf("%c", &chess[i][j]);
            if (chess[i][j] == 'F') {
                if ((i == 0 || i == 2 || i == 4 || i == 6) && (j == 0 || j == 2 || j == 4 || j == 6)) {
                    count++;
                } else if ((i == 1 || i == 3 || i == 5 || i == 7) && (j == 1 || j == 3 || j == 5 || j == 7)) {
                    count++;
                }
            }
        }
        getchar();
    }
    printf("%d\n", count);
}