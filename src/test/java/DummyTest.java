import org.testng.annotations.Test;

import static Helper.Constants.*;
import static Helper.ReadFile.readLineByLineJava;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.MatcherAssert.assertThat;


public class DummyTest {


    @Test(enabled = true)
    public void validates_empty_schema_in_classpath() {

        // Given
        String expectedJson = readLineByLineJava(EMPTY_JSON_PATH);

        // Then
        assertThat(expectedJson, matchesJsonSchemaInClasspath("Schema/empty.schema.json"));
    }

    @Test(enabled = true)
    public void validates_type_schema_in_classpath() {

        // Given
        String expectedJson = readLineByLineJava(TYPE_JSON_PATH);

        // Then
        assertThat(expectedJson, matchesJsonSchemaInClasspath("Schema/type.schema.json"));
    }

    @Test(enabled =true )
    public void validates__schema_in_classpath() {

        // Given
        String expectedJson = readLineByLineJava(ENUM_JSON_PATH);

        // Then
        assertThat(expectedJson, matchesJsonSchemaInClasspath("Schema/enum.schema.json"));
    }

    @Test(enabled = true)
    public void validates_min_max_schema_in_classpath() {

        // Given
        String expectedJson = readLineByLineJava(MIN_MAX_JSON_PATH);

        // Then
        assertThat(expectedJson, matchesJsonSchemaInClasspath("Schema/min_max.schema.json"));
    }

    @Test(enabled = true)
    public void validates_exclusive_min_max_schema_in_classpath() {

        // Given
        String expectedJson = readLineByLineJava(EXCLUSIVE_MIN_MAX_JSON_PATH);

        // Then
        assertThat(expectedJson, matchesJsonSchemaInClasspath("Schema/exclusive_min_max.schema.json"));
    }

    @Test(enabled = true)
    public void validates_multipleOf_schema_in_classpath() {

        // Given
        String expectedJson = readLineByLineJava(MULTIPLEOF_JSON_PATH);

        // Then
        assertThat(expectedJson, matchesJsonSchemaInClasspath("Schema/multipleOf.schema.json"));
    }

    @Test(enabled = true)
    public void validates_min_max_length_schema_in_classpath() {

        // Given
        String expectedJson = readLineByLineJava(MIN_MAX_LENGTH_JSON_PATH);

        // Then
        assertThat(expectedJson, matchesJsonSchemaInClasspath("Schema/min_max_length.schema.json"));
    }

    @Test(enabled = true)
    public void validates_pattern_schema_in_classpath() {

        // Given
        String expectedJson = readLineByLineJava(PATTERN_JSON_PATH);

        // Then
        assertThat(expectedJson, matchesJsonSchemaInClasspath("Schema/pattern.schema.json"));
    }

    @Test(enabled = true)
    public void validates_format_schema_in_classpath() {

        // Given
        String expectedJson = readLineByLineJava(FORMAT_JSON_PATH);

        // Then
        assertThat(expectedJson, matchesJsonSchemaInClasspath("Schema/format.schema.json"));
    }

    @Test(enabled = true)
    public void validates_maxItems1_schema_in_classpath() {

        // Given
        String expectedJson = readLineByLineJava(ARRAY_JSON_PATH);

        // Then
        assertThat(expectedJson, matchesJsonSchemaInClasspath("Schema/array_maxitems.schema1.json"));
    }

    @Test(enabled = true)
    public void validates_maxItems2_schema_in_classpath() {

        // Given
        String expectedJson = readLineByLineJava(ARRAY_JSON_PATH);

        // Then
        assertThat(expectedJson, matchesJsonSchemaInClasspath("Schema/array_maxitems.schema2.json"));
    }

    @Test(enabled = true)
    public void validates_additionalItems_schema_in_classpath() {

        // Given
        String expectedJson = readLineByLineJava(ARRAY_JSON_PATH);

        // Then
        assertThat(expectedJson, matchesJsonSchemaInClasspath("Schema/array_additionalItems.schema.json"));
    }

    @Test(enabled = false)
    public void validates_properties_schema_in_classpath() {

        // Given
        String expectedJson = readLineByLineJava(PROPERTIES_JSON_PATH);


        // Then
        assertThat(expectedJson, matchesJsonSchemaInClasspath("Schema/properties.schema.json"));
    }

    @Test(enabled = false)
    public void validates_properties_regex_schema_in_classpath() {

        // Given
        String expectedJson = readLineByLineJava(PROPERTIES_REGEX_JSON_PATH);

        // Then
        assertThat(expectedJson, matchesJsonSchemaInClasspath("Schema/properties_regex.schema.json"));
    }

    @Test(enabled = true)
    public void validates_internal_ref_regex_schema_in_classpath() {

        // Given
        String expectedJson = readLineByLineJava(INTERNAL_REF_JSON_PATH);

        // Then
        assertThat(expectedJson, matchesJsonSchemaInClasspath("Schema/internal_ref.schema.json"));
    }


}
