#include <stdio.h>

int main() {
	char chessboard[8][8];
	int count = 0;
	for (int i = 0; i < 8; i++) scanf("%s", chessboard[i]);
	for (int i = 0; i < 8; i++) {
		for (int j = 0; j < 8; j++) {
			if ((i + j) % 2 == 0 && chessboard[i][j] == 'F')
				count++;
		}
	} printf("%d\n", count);
}