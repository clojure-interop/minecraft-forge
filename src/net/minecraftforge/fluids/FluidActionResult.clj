(ns net.minecraftforge.fluids.FluidActionResult
  "Holds the result of a fluid action from FluidUtil.

  Failed actions will always have isSuccess() == false and an empty ItemStack result. See FAILURE.

  Successful actions will always have isSuccess() == true.
  Successful actions may have an empty ItemStack result in some cases,
  for example the action succeeded and the resulting item was consumed."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fluids FluidActionResult]))

(defn ->fluid-action-result
  "Constructor.

  result - `net.minecraft.item.ItemStack`"
  (^FluidActionResult [^net.minecraft.item.ItemStack result]
    (new FluidActionResult result)))

(def *-failure
  "Static Constant.

  type: net.minecraftforge.fluids.FluidActionResult"
  FluidActionResult/FAILURE)

(defn success
  "Instance Constant.

  type: boolean"
  (^Boolean [^FluidActionResult this]
    (-> this .-success)))

(defn result
  "Instance Constant.

  type: net.minecraft.item.ItemStack"
  (^net.minecraft.item.ItemStack [^FluidActionResult this]
    (-> this .-result)))

(defn success?
  "returns: `boolean`"
  (^Boolean [^FluidActionResult this]
    (-> this (.isSuccess))))

(defn get-result
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^FluidActionResult this]
    (-> this (.getResult))))

