(ns net.minecraftforge.event.world.BlockEvent$MultiPlaceEvent
  "Fired when a single block placement action of a player triggers the
  creation of multiple blocks(e.g. placing a bed block). The block returned
  by BlockEvent.state and its related methods is the block where
  the placed block would exist if the placement only affected a single
  block."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world BlockEvent$MultiPlaceEvent]))

(defn ->multi-place-event
  "Constructor.

  block-snapshots - `java.util.List`
  placed-against - `net.minecraft.block.state.IBlockState`
  player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`"
  (^BlockEvent$MultiPlaceEvent [^java.util.List block-snapshots ^net.minecraft.block.state.IBlockState placed-against ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (new BlockEvent$MultiPlaceEvent block-snapshots placed-against player hand))
  (^BlockEvent$MultiPlaceEvent [^java.util.List block-snapshots ^net.minecraft.block.state.IBlockState placed-against ^net.minecraft.entity.player.EntityPlayer player]
    (new BlockEvent$MultiPlaceEvent block-snapshots placed-against player)))

(defn get-replaced-block-snapshots
  "Gets a list of BlockSnapshots for all blocks which were replaced by the
   placement of the new blocks. Most of these blocks will just be of type AIR.

  returns: immutable list of replaced BlockSnapshots - `java.util.List<net.minecraftforge.common.util.BlockSnapshot>`"
  (^java.util.List [^BlockEvent$MultiPlaceEvent this]
    (-> this (.getReplacedBlockSnapshots))))

