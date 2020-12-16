import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { BackendService } from './backend.service';
import { FormsModule } from '@angular/forms';
import { CatalogModule } from './catalog/catalog.module';
import { HomeModule } from './home/home.module';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { ProductListComponent } from './catalog/product-list/product-list.component';
import { ProductDetailComponent } from './product-detail/product-detail.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent,
  },
  {
    path: '',
    pathMatch: 'full',
    redirectTo: 'home',
  },
  {
    path: 'home',
    component: HomeComponent,
  },
  {
    path: 'login',
    component: LoginComponent,
  },
  {
    path: 'products',
    component: ProductListComponent,
  },
  {
    path: 'products/:id',
    component: ProductDetailComponent,
  },
  {
    path: '**',
    component: PageNotFoundComponent,
  },
];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    LoginComponent,
    PageNotFoundComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    CatalogModule,
    HomeModule,
    RouterModule.forRoot(routes),
  ],
  providers: [BackendService],
  bootstrap: [AppComponent],
})
export class AppModule {}
