import React from 'react';
import TestUtils from 'react/lib/ReactTestUtils';
import { Title } from './title';

describe('title component', function() {
  it('should render "Hello, Activities!"', function() {
    var title = TestUtils.renderIntoDocument(<Title/>);
    var h1 = TestUtils.findRenderedDOMComponentWithTag(title, 'h1');
    expect(h1.textContent).toEqual('Hello, Activities!');
  });
});
