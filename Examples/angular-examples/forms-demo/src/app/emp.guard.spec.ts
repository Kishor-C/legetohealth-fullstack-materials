import { TestBed } from '@angular/core/testing';

import { EmpGuard } from './emp.guard';

describe('EmpGuard', () => {
  let guard: EmpGuard;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    guard = TestBed.inject(EmpGuard);
  });

  it('should be created', () => {
    expect(guard).toBeTruthy();
  });
});
