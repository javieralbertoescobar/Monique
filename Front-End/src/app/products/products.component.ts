import { Component, OnInit } from '@angular/core';
import {Observable} from "rxjs";
import { ProductsService } from '../products.service';
import {Product} from '../product';
import { Router } from '@angular/router';


@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit {

  constructor(private productservice: ProductsService, private router:Router) {}
  products: Observable<Product[]>;


  ngOnInit(): void {
    this.reloadData();
  }

  reloadData() {
    this.products = this.productservice.getProductsList();
  }

}
