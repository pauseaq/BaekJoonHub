#include <stdio.h>

int main() {
    while(1) {
        int input, sum = 0;
        scanf("%d", &input);
        if (input == 0) break;
        for (int i = input; i > 0; i--) {
            sum += i;
        }
        printf("%d\n", sum);
    }
}