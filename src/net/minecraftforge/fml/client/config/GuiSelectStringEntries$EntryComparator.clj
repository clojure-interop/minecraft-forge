(ns net.minecraftforge.fml.client.config.GuiSelectStringEntries$EntryComparator
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client.config GuiSelectStringEntries$EntryComparator]))

(defn ->entry-comparator
  "Constructor."
  (^GuiSelectStringEntries$EntryComparator []
    (new GuiSelectStringEntries$EntryComparator )))

(defn compare
  "o-1 - `java.util.Map.Entry`
  o-2 - `java.util.Map.Entry`

  returns: `int`"
  (^Integer [^GuiSelectStringEntries$EntryComparator this ^java.util.Map.Entry o-1 ^java.util.Map.Entry o-2]
    (-> this (.compare o-1 o-2))))

