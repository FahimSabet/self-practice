Feature: Testing application title

  Scenario: page title should be Tek Insurance Service

#    Given Open browser and navigate
    Then Validate application title should be "Tek Insurance Service"
#    Then Close browser


    Scenario: Validate first page header title
#      Given Open browser and navigate
    Then Validate the header title is "TEK Insurance Portal"
#    Then Close browser


# the reason we terminated those steps are, we were able to create the hooks setup to execute the before and the after steps









