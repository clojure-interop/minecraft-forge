(ns net.minecraft.item.ItemCloth
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemCloth]))

(defn ->item-cloth
  "Constructor.

  block - `net.minecraft.block.Block`"
  (^ItemCloth [^net.minecraft.block.Block block]
    (new ItemCloth block)))

(defn get-metadata
  "damage - `int`

  returns: `int`"
  (^Integer [^ItemCloth this ^Integer damage]
    (-> this (.getMetadata damage))))

(defn get-unlocalized-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemCloth this ^net.minecraft.item.ItemStack stack]
    (-> this (.getUnlocalizedName stack))))

