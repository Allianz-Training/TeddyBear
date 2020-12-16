import { Injectable } from '@angular/core';
import { Product } from './catalog/product/product';

@Injectable({
  providedIn: 'root',
})
export class BackendService {
  constructor() {}
  getProducts(): Product[] {
    return [
      { name: 'Som O', price: 111 },
      { name: 'Tang Mo', price: 222 },
      { name: 'Ma Prow Nam Hom', price: 333 },
    ];
  }
  getProductById(productId: number): Product {
    return;
  }
}
