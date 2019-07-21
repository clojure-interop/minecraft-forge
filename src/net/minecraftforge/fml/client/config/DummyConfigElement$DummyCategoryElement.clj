(ns net.minecraftforge.fml.client.config.DummyConfigElement$DummyCategoryElement
  "This class provides a Dummy Category IConfigElement. It can be used to define a custom list of GUI entries that will
  appear on the child screen or to specify a custom IGuiConfigListEntry for a special category."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config DummyConfigElement$DummyCategoryElement]))

(defn ->dummy-category-element
  "Constructor.

  name - `java.lang.String`
  lang-key - `java.lang.String`
  child-elements - `java.util.List`
  custom-list-entry-class - `java.lang.Class`"
  (^DummyConfigElement$DummyCategoryElement [^java.lang.String name ^java.lang.String lang-key ^java.util.List child-elements ^java.lang.Class custom-list-entry-class]
    (new DummyConfigElement$DummyCategoryElement name lang-key child-elements custom-list-entry-class))
  (^DummyConfigElement$DummyCategoryElement [^java.lang.String name ^java.lang.String lang-key ^java.util.List child-elements]
    (new DummyConfigElement$DummyCategoryElement name lang-key child-elements)))

