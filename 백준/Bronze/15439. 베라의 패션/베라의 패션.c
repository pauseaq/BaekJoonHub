#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    if (n == 1) printf("0\n");
    else printf("%d\n", n * (n - 1));   
}