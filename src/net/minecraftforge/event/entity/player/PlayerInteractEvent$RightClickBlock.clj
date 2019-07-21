(ns net.minecraftforge.event.entity.player.PlayerInteractEvent$RightClickBlock
  "This event is fired on both sides whenever the player right clicks while targeting a block.
  This event controls which of Block.onBlockActivated(net.minecraft.world.World, net.minecraft.util.math.BlockPos, net.minecraft.block.state.IBlockState, net.minecraft.entity.player.EntityPlayer, net.minecraft.util.EnumHand, net.minecraft.util.EnumFacing, float, float, float) and/or Item.onItemUse(net.minecraft.entity.player.EntityPlayer, net.minecraft.world.World, net.minecraft.util.math.BlockPos, net.minecraft.util.EnumHand, net.minecraft.util.EnumFacing, float, float, float)
  will be called after Item.onItemUseFirst(net.minecraft.entity.player.EntityPlayer, net.minecraft.world.World, net.minecraft.util.math.BlockPos, net.minecraft.util.EnumFacing, float, float, float, net.minecraft.util.EnumHand) is called.
  Canceling the event will cause none of the above three to be called.
  There are various results to this event, see the getters below.
  Note that handling things differently on the client vs server may cause desynchronizations!"
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerInteractEvent$RightClickBlock]))

(defn ->right-click-block
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`
  pos - `net.minecraft.util.math.BlockPos`
  face - `net.minecraft.util.EnumFacing`
  hit-vec - `net.minecraft.util.math.Vec3d`"
  (^PlayerInteractEvent$RightClickBlock [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand ^net.minecraft.util.math.BlockPos pos ^net.minecraft.util.EnumFacing face ^net.minecraft.util.math.Vec3d hit-vec]
    (new PlayerInteractEvent$RightClickBlock player hand pos face hit-vec)))

(defn get-hit-vec
  "returns: The hit vector of this click - `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^PlayerInteractEvent$RightClickBlock this]
    (-> this (.getHitVec))))

(defn get-use-block
  "returns: If Block.onBlockActivated(net.minecraft.world.World, net.minecraft.util.math.BlockPos, net.minecraft.block.state.IBlockState, net.minecraft.entity.player.EntityPlayer, net.minecraft.util.EnumHand, net.minecraft.util.EnumFacing, float, float, float) should be called - `net.minecraftforge.fml.common.eventhandler.Event$Result`"
  (^net.minecraftforge.fml.common.eventhandler.Event$Result [^PlayerInteractEvent$RightClickBlock this]
    (-> this (.getUseBlock))))

(defn get-use-item
  "returns: If Item.onItemUse(net.minecraft.entity.player.EntityPlayer, net.minecraft.world.World, net.minecraft.util.math.BlockPos, net.minecraft.util.EnumHand, net.minecraft.util.EnumFacing, float, float, float) should be called - `net.minecraftforge.fml.common.eventhandler.Event$Result`"
  (^net.minecraftforge.fml.common.eventhandler.Event$Result [^PlayerInteractEvent$RightClickBlock this]
    (-> this (.getUseItem))))

(defn set-use-block
  "DENY: Block will never be used.
   DEFAULT: Default behaviour (sneak will not use block, unless all items return true in Item.doesSneakBypassUse(net.minecraft.item.ItemStack, net.minecraft.world.IBlockAccess, net.minecraft.util.math.BlockPos, net.minecraft.entity.player.EntityPlayer)).
   ALLOW: Block will always be used, regardless of sneaking and doesSneakBypassUse.

  trigger-block - `net.minecraftforge.fml.common.eventhandler.Event$Result`"
  ([^PlayerInteractEvent$RightClickBlock this ^net.minecraftforge.fml.common.eventhandler.Event$Result trigger-block]
    (-> this (.setUseBlock trigger-block))))

(defn set-use-item
  "DENY: The item will never be used.
   DEFAULT: The item will be used if the block fails.
   ALLOW: The item will always be used.

  trigger-item - `net.minecraftforge.fml.common.eventhandler.Event$Result`"
  ([^PlayerInteractEvent$RightClickBlock this ^net.minecraftforge.fml.common.eventhandler.Event$Result trigger-item]
    (-> this (.setUseItem trigger-item))))

(defn set-canceled
  "Description copied from class: Event

  canceled - The new canceled value - `boolean`"
  ([^PlayerInteractEvent$RightClickBlock this ^Boolean canceled]
    (-> this (.setCanceled canceled))))

