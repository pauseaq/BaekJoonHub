#include <stdio.h>

int main() {
  int k, n, m;
  scanf("%d %d %d", &k, &n, &m);
  if (k * n > m) printf("%d\n", k * n - m);
  else printf("0\n");
}