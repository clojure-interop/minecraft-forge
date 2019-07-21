(ns net.minecraft.block.state.BlockPistonStructureHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraft.block.state BlockPistonStructureHelper]))

(defn ->block-piston-structure-helper
  "Constructor.

  world-in - `net.minecraft.world.World`
  pos-in - `net.minecraft.util.math.BlockPos`
  piston-facing - `net.minecraft.util.EnumFacing`
  extending - `boolean`"
  (^BlockPistonStructureHelper [^net.minecraft.world.World world-in ^net.minecraft.util.math.BlockPos pos-in ^net.minecraft.util.EnumFacing piston-facing ^Boolean extending]
    (new BlockPistonStructureHelper world-in pos-in piston-facing extending)))

(defn can-move?
  "returns: `boolean`"
  (^Boolean [^BlockPistonStructureHelper this]
    (-> this (.canMove))))

(defn get-blocks-to-move
  "returns: `java.util.List<net.minecraft.util.math.BlockPos>`"
  (^java.util.List [^BlockPistonStructureHelper this]
    (-> this (.getBlocksToMove))))

(defn get-blocks-to-destroy
  "returns: `java.util.List<net.minecraft.util.math.BlockPos>`"
  (^java.util.List [^BlockPistonStructureHelper this]
    (-> this (.getBlocksToDestroy))))

