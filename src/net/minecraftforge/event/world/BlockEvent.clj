(ns net.minecraftforge.event.world.BlockEvent
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world BlockEvent]))

(defn ->block-event
  "Constructor.

  world - `net.minecraft.world.World`
  pos - `net.minecraft.util.math.BlockPos`
  state - `net.minecraft.block.state.IBlockState`"
  (^BlockEvent [^net.minecraft.world.World world ^net.minecraft.util.math.BlockPos pos ^net.minecraft.block.state.IBlockState state]
    (new BlockEvent world pos state)))

(defn get-world
  "returns: `net.minecraft.world.World`"
  (^net.minecraft.world.World [^BlockEvent this]
    (-> this (.getWorld))))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^BlockEvent this]
    (-> this (.getPos))))

(defn get-state
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockEvent this]
    (-> this (.getState))))

