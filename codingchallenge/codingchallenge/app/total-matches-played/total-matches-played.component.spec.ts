import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TotalMatchesPlayedComponent } from './total-matches-played.component';

describe('TotalMatchesPlayedComponent', () => {
  let component: TotalMatchesPlayedComponent;
  let fixture: ComponentFixture<TotalMatchesPlayedComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [TotalMatchesPlayedComponent]
    });
    fixture = TestBed.createComponent(TotalMatchesPlayedComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
