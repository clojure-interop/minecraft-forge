(ns net.minecraft.util.FoodStats
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.util FoodStats]))

(defn ->food-stats
  "Constructor."
  (^FoodStats []
    (new FoodStats )))

(defn add-exhaustion
  "exhaustion - `float`"
  ([^FoodStats this ^Float exhaustion]
    (-> this (.addExhaustion exhaustion))))

(defn on-update
  "player - `net.minecraft.entity.player.EntityPlayer`"
  ([^FoodStats this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.onUpdate player))))

(defn set-food-level
  "food-level-in - `int`"
  ([^FoodStats this ^Integer food-level-in]
    (-> this (.setFoodLevel food-level-in))))

(defn need-food
  "returns: `boolean`"
  (^Boolean [^FoodStats this]
    (-> this (.needFood))))

(defn get-food-level
  "returns: `int`"
  (^Integer [^FoodStats this]
    (-> this (.getFoodLevel))))

(defn read-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^FoodStats this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.readNBT compound))))

(defn get-saturation-level
  "returns: `float`"
  (^Float [^FoodStats this]
    (-> this (.getSaturationLevel))))

(defn add-stats
  "food-level-in - `int`
  food-saturation-modifier - `float`"
  ([^FoodStats this ^Integer food-level-in ^Float food-saturation-modifier]
    (-> this (.addStats food-level-in food-saturation-modifier))))

(defn set-food-saturation-level
  "food-saturation-level-in - `float`"
  ([^FoodStats this ^Float food-saturation-level-in]
    (-> this (.setFoodSaturationLevel food-saturation-level-in))))

(defn write-nbt
  "compound - `net.minecraft.nbt.NBTTagCompound`"
  ([^FoodStats this ^net.minecraft.nbt.NBTTagCompound compound]
    (-> this (.writeNBT compound))))

