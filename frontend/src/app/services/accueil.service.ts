import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})
export class AccueilService {
host=environment.host;
  constructor(private http:HttpClient) { }

  //La liste globale des apprenants
  getAllApp(){
    return this.http.get(this.host+"/ListApp");
  }

  saveApp(data:any){
    return this.http.post(this.host+"/AddApp", data);
  }

  //service group ajout
  saveListGroup(affectation:any){
    return this.http.post(this.host+"/AddGroup", affectation);
  }

  updateApp(data:any, id:number){
    return this.http.put(this.host+"/updatApp/"+id,data)

  }
  deleteApp(id:number){
    return this.http.delete(this.host+"/DeleteApp/"+id)
  }
}
