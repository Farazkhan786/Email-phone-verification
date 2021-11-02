import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContainerformComponent } from './containerform.component';

describe('ContainerformComponent', () => {
  let component: ContainerformComponent;
  let fixture: ComponentFixture<ContainerformComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ContainerformComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ContainerformComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
