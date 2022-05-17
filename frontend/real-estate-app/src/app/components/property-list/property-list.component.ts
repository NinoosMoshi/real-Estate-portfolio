import { HousingService } from './../../services/housing.service';
import { Component, OnInit } from '@angular/core';
import { Property } from 'src/app/model/property';

@Component({
  selector: 'app-property-list',
  templateUrl: './property-list.component.html',
  styleUrls: ['./property-list.component.css']
})
export class PropertyListComponent implements OnInit {

  properties: Property[];

  constructor(private housingService: HousingService) { }

  ngOnInit(): void {
    this.getProperties();
  }

  getProperties(){
    this.housingService.getAllProperties().subscribe(data => {
      this.properties = data
    })
  }


}
