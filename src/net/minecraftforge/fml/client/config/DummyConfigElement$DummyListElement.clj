(ns net.minecraftforge.fml.client.config.DummyConfigElement$DummyListElement
  "This class provides a dummy array-type IConfigElement."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config DummyConfigElement$DummyListElement]))

(defn ->dummy-list-element
  "Constructor.

  name - `java.lang.String`
  default-values - `java.lang.Object[]`
  type - `net.minecraftforge.fml.client.config.ConfigGuiType`
  lang-key - `java.lang.String`
  is-list-fixed-length - `boolean`
  max-list-length - `int`
  valid-string-pattern - `java.util.regex.Pattern`
  min-value - `java.lang.Object`
  max-value - `java.lang.Object`"
  (^DummyConfigElement$DummyListElement [^java.lang.String name default-values ^net.minecraftforge.fml.client.config.ConfigGuiType type ^java.lang.String lang-key ^Boolean is-list-fixed-length ^Integer max-list-length ^java.util.regex.Pattern valid-string-pattern ^java.lang.Object min-value ^java.lang.Object max-value]
    (new DummyConfigElement$DummyListElement name default-values type lang-key is-list-fixed-length max-list-length valid-string-pattern min-value max-value))
  (^DummyConfigElement$DummyListElement [^java.lang.String name default-values ^net.minecraftforge.fml.client.config.ConfigGuiType type ^java.lang.String lang-key ^Boolean is-list-fixed-length ^Integer max-list-length ^java.lang.Object min-value ^java.lang.Object max-value]
    (new DummyConfigElement$DummyListElement name default-values type lang-key is-list-fixed-length max-list-length min-value max-value))
  (^DummyConfigElement$DummyListElement [^java.lang.String name default-values ^net.minecraftforge.fml.client.config.ConfigGuiType type ^java.lang.String lang-key ^Boolean is-list-fixed-length ^java.lang.Object min-value ^java.lang.Object max-value]
    (new DummyConfigElement$DummyListElement name default-values type lang-key is-list-fixed-length min-value max-value))
  (^DummyConfigElement$DummyListElement [^java.lang.String name default-values ^net.minecraftforge.fml.client.config.ConfigGuiType type ^java.lang.String lang-key ^java.lang.Object min-value ^java.lang.Object max-value]
    (new DummyConfigElement$DummyListElement name default-values type lang-key min-value max-value))
  (^DummyConfigElement$DummyListElement [^java.lang.String name default-values ^net.minecraftforge.fml.client.config.ConfigGuiType type ^java.lang.String lang-key ^Boolean is-list-fixed-length]
    (new DummyConfigElement$DummyListElement name default-values type lang-key is-list-fixed-length))
  (^DummyConfigElement$DummyListElement [^java.lang.String name default-values ^net.minecraftforge.fml.client.config.ConfigGuiType type ^java.lang.String lang-key]
    (new DummyConfigElement$DummyListElement name default-values type lang-key)))

(defn set-custom-edit-list-entry-class
  "clazz - `java.lang.Class`

  returns: `net.minecraftforge.fml.client.config.DummyConfigElement$DummyListElement`"
  (^net.minecraftforge.fml.client.config.DummyConfigElement$DummyListElement [^DummyConfigElement$DummyListElement this ^java.lang.Class clazz]
    (-> this (.setCustomEditListEntryClass clazz))))

(defn get-default
  "Description copied from interface: IConfigElement

  returns: `java.lang.Object`"
  (^java.lang.Object [^DummyConfigElement$DummyListElement this]
    (-> this (.getDefault))))

