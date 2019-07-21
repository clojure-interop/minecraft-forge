(ns net.minecraft.item.ItemLeaves
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.item ItemLeaves]))

(defn ->item-leaves
  "Constructor.

  block - `net.minecraft.block.BlockLeaves`"
  (^ItemLeaves [^net.minecraft.block.BlockLeaves block]
    (new ItemLeaves block)))

(defn get-metadata
  "damage - `int`

  returns: `int`"
  (^Integer [^ItemLeaves this ^Integer damage]
    (-> this (.getMetadata damage))))

(defn get-unlocalized-name
  "stack - `net.minecraft.item.ItemStack`

  returns: `java.lang.String`"
  (^java.lang.String [^ItemLeaves this ^net.minecraft.item.ItemStack stack]
    (-> this (.getUnlocalizedName stack))))

