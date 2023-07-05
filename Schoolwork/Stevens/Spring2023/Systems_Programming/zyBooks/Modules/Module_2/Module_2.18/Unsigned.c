#include <stdio.h>

int main(void) {
   unsigned long memSizeGiB;
   unsigned long long memSizeBytes;
   unsigned long long memSizeBits;
   
   printf("Enter memory size in GiBs: ");
   scanf("%lu", &memSizeGiB);
   
   // 1 GiB = 1024 MiB, 1 MiB = 1024 KiB, 1 KiB = 1024 bytes
   memSizeBytes = memSizeGiB * (1024 * 1024 * 1024);
   // 1 byte = 8 bits
   memSizeBits = memSizeBytes * 8;
   
   printf("Memory size in bytes: %llu\n", memSizeBytes);
   printf("Memory size in bits: %llu\n", memSizeBits);
   
   return 0;
}