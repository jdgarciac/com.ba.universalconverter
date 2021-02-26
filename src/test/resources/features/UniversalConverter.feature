#Juan David Garcia

Feature: As a User I need to use the Universal Coverter App
  to make unit conversions
  and validate results

  @convert_length_android
  Scenario Outline: Convert a lenght value from one unit to another
    When the user introduces the data to make length conversion
      |length  |unit_from  |unit_to  |result  |
      |<length>|<unit_from>|<unit_to>|<result>|
    Then he validates the lenght "<result>"

    Examples:
      |length  |unit_from  |unit_to         |result  |
      |69      |Metro      |Centimetro      |6900 |

  @convert_velocity_android
  Scenario Outline: Convert a velocity value from one unit to another
    When he introduces the data to make velocity conversion
      |velocity  |unit_from  |unit_to  |result  |
      |<velocity>|<unit_from>|<unit_to>|<result>|
    Then he validates the velocity "<result>"

    Examples:
      |velocity  |unit_from  |unit_to         |result    |
      |69        |Metro (m)  |Milla (mi)      |0,04 mi |

  @convert_area_android
  Scenario Outline: Convert an area value from one unit to another
    When he introduces the data to make area conversion
      |area  |unit_from  |unit_to  |result  |
      |<area>|<unit_from>|<unit_to>|<result>|
    Then he validates the area "<result>"

    Examples:
      |area  |unit_from |unit_to |result |
      |69    |cm²       |m²      |0.0069 |