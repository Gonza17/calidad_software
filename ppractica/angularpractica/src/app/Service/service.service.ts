import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { persona } from '../Modelo/persona'
@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  persona:persona[];
  constructor(private http:HttpClient) { }

  Url='http://localhost:8080/ppractica'
  getPersona(){
    return this.http.get<persona[]> (this.Url + '/persona');
  }

}
