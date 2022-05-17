import { Property } from './../model/property';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HousingService {


  private baseUrl = 'http://localhost:8080/api/v1/property';


  constructor(private http: HttpClient) { }


   // http://localhost:8080/api/v1/property/all
   getAllProperties():Observable<Property[]>{
   return this.http.get<Property[]>(`${this.baseUrl}/all`);
  }







}
