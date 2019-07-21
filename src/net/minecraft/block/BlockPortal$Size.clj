(ns net.minecraft.block.BlockPortal$Size
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block BlockPortal$Size]))

(defn ->size
  "Constructor.

  world-in - `net.minecraft.world.World`
  p-i-45694-2 - `net.minecraft.util.math.BlockPos`
  p-i-45694-3 - `net.minecraft.util.EnumFacing$Axis`"
  (^BlockPortal$Size [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos p-i-45694-2 ^net.minecraft.util.EnumFacing$Axis p-i-45694-3]
    (new BlockPortal$Size world-in p-i-45694-2 p-i-45694-3)))

(defn get-height
  "returns: `int`"
  (^Integer [^BlockPortal$Size this]
    (-> this (.getHeight))))

(defn get-width
  "returns: `int`"
  (^Integer [^BlockPortal$Size this]
    (-> this (.getWidth))))

(defn valid?
  "returns: `boolean`"
  (^Boolean [^BlockPortal$Size this]
    (-> this (.isValid))))

(defn place-portal-blocks
  ""
  ([^BlockPortal$Size this]
    (-> this (.placePortalBlocks))))

