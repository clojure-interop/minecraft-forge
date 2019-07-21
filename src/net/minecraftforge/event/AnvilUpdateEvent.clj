(ns net.minecraftforge.event.AnvilUpdateEvent
  "AnvilUpdateEvent is fired when a player places items in both the left and right slots of a anvil.
  If the event is canceled, vanilla behavior will not run, and the output will be set to null.
  If the event is not canceled, but the output is not null, it will set the output and not run vanilla behavior.
  if the output is null, and the event is not canceled, vanilla behavior will execute."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event AnvilUpdateEvent]))

(defn ->anvil-update-event
  "Constructor.

  left - `net.minecraft.item.ItemStack`
  right - `net.minecraft.item.ItemStack`
  name - `java.lang.String`
  cost - `int`"
  (^AnvilUpdateEvent [^net.minecraft.item.ItemStack left ^net.minecraft.item.ItemStack right ^java.lang.String name ^Integer cost]
    (new AnvilUpdateEvent left right name cost)))

(defn set-cost
  "cost - `int`"
  ([^AnvilUpdateEvent this ^Integer cost]
    (-> this (.setCost cost))))

(defn get-left
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^AnvilUpdateEvent this]
    (-> this (.getLeft))))

(defn get-cost
  "returns: `int`"
  (^Integer [^AnvilUpdateEvent this]
    (-> this (.getCost))))

(defn set-output
  "output - `net.minecraft.item.ItemStack`"
  ([^AnvilUpdateEvent this ^net.minecraft.item.ItemStack output]
    (-> this (.setOutput output))))

(defn get-name
  "returns: `java.lang.String`"
  (^java.lang.String [^AnvilUpdateEvent this]
    (-> this (.getName))))

(defn get-material-cost
  "returns: `int`"
  (^Integer [^AnvilUpdateEvent this]
    (-> this (.getMaterialCost))))

(defn get-right
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^AnvilUpdateEvent this]
    (-> this (.getRight))))

(defn get-output
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^AnvilUpdateEvent this]
    (-> this (.getOutput))))

(defn set-material-cost
  "material-cost - `int`"
  ([^AnvilUpdateEvent this ^Integer material-cost]
    (-> this (.setMaterialCost material-cost))))

