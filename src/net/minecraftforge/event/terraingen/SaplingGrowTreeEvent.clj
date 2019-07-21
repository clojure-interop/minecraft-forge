(ns net.minecraftforge.event.terraingen.SaplingGrowTreeEvent
  "SaplingGrowTreeEvent is fired when a sapling grows into a tree.
  This event is fired during sapling growth in
  BlockSapling.generateTree(World, BlockPos, IBlockState, Random).

  pos contains the coordinates of the growing sapling.
  rand contains an instance of Random for use.

  This event is not Cancelable.

  This event has a result. Event.HasResult
  This result determines if the sapling is allowed to grow.

  This event is fired on the MinecraftForge.TERRAIN_GEN_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.terraingen SaplingGrowTreeEvent]))

(defn ->sapling-grow-tree-event
  "Constructor.

  world - `net.minecraft.world.World`
  rand - `java.util.Random`
  pos - `net.minecraft.util.math.BlockPos`"
  (^SaplingGrowTreeEvent [^net.minecraft.world.World world ^java.util.Random rand ^net.minecraft.util.math.BlockPos pos]
    (new SaplingGrowTreeEvent world rand pos)))

(defn get-pos
  "returns: `net.minecraft.util.math.BlockPos`"
  (^net.minecraft.util.math.BlockPos [^SaplingGrowTreeEvent this]
    (-> this (.getPos))))

(defn get-rand
  "returns: `java.util.Random`"
  (^java.util.Random [^SaplingGrowTreeEvent this]
    (-> this (.getRand))))

