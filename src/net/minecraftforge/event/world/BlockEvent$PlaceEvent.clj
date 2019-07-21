(ns net.minecraftforge.event.world.BlockEvent$PlaceEvent
  "Called when a block is placed by a player.

  If a Block Place event is cancelled, the block will not be placed."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.world BlockEvent$PlaceEvent]))

(defn ->place-event
  "Constructor.

  block-snapshot - `net.minecraftforge.common.util.BlockSnapshot`
  placed-against - `net.minecraft.block.state.IBlockState`
  player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`"
  (^BlockEvent$PlaceEvent [^net.minecraftforge.common.util.BlockSnapshot block-snapshot ^net.minecraft.block.state.IBlockState placed-against ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (new BlockEvent$PlaceEvent block-snapshot placed-against player hand))
  (^BlockEvent$PlaceEvent [^net.minecraftforge.common.util.BlockSnapshot block-snapshot ^net.minecraft.block.state.IBlockState placed-against ^net.minecraft.entity.player.EntityPlayer player]
    (new BlockEvent$PlaceEvent block-snapshot placed-against player)))

(defn get-player
  "returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^BlockEvent$PlaceEvent this]
    (-> this (.getPlayer))))

(defn get-item-in-hand
  "Deprecated.

  returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^BlockEvent$PlaceEvent this]
    (-> this (.getItemInHand))))

(defn get-block-snapshot
  "returns: `net.minecraftforge.common.util.BlockSnapshot`"
  (^net.minecraftforge.common.util.BlockSnapshot [^BlockEvent$PlaceEvent this]
    (-> this (.getBlockSnapshot))))

(defn get-placed-block
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockEvent$PlaceEvent this]
    (-> this (.getPlacedBlock))))

(defn get-placed-against
  "returns: `net.minecraft.block.state.IBlockState`"
  (^net.minecraft.block.state.IBlockState [^BlockEvent$PlaceEvent this]
    (-> this (.getPlacedAgainst))))

(defn get-hand
  "returns: `net.minecraft.util.EnumHand`"
  (^net.minecraft.util.EnumHand [^BlockEvent$PlaceEvent this]
    (-> this (.getHand))))

