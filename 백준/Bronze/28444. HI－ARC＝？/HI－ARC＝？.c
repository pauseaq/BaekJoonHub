#include <stdio.h>

int main() {
    int h, i, a, r, c;
    scanf("%d %d %d %d %d", &h, &i, &a, &r, &c);
    printf("%d\n", (h * i) - (a * r * c));
}