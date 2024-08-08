import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ComputeVoteComponent } from './compute-vote.component';

describe('ComputeVoteComponent', () => {
  let component: ComputeVoteComponent;
  let fixture: ComponentFixture<ComputeVoteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ComputeVoteComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ComputeVoteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });


  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
