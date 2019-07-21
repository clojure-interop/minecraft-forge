(ns net.minecraft.item.ItemColored
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemColored]))

(defn ->item-colored
  "Constructor.

  block - `net.minecraft.block.Block`
  has-subtypes - `boolean`"
  (^ItemColored [^net.minecraft.block.Block block ^Boolean has-subtypes]
    (new ItemColored block has-subtypes)))

(defn get-metadata
  "damage - `int`

  returns: `int`"
  (^Integer [^ItemColored this ^Integer damage]
    (-> this (.getMetadata damage))))

(defn set-subtype-names
  "names - `java.lang.String[]`

  returns: `net.minecraft.item.ItemColored`"
  (^net.minecraft.item.ItemColored [^ItemColored this names]
    (-> this (.setSubtypeNames names))))

(defn get-unlocalized-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemColored this ^net.minecraft.item.ItemStack stack]
    (-> this (.getUnlocalizedName stack))))

