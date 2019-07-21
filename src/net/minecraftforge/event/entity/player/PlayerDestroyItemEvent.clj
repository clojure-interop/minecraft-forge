(ns net.minecraftforge.event.entity.player.PlayerDestroyItemEvent
  "PlayerDestroyItemEvent is fired when a player destroys an item.
  This event is fired whenever a player destroys an item in
  PlayerControllerMP#processRightClick(EntityPlayer, World, ItemStack, EnumHand),
  PlayerControllerMP#processRightClickBlock(EntityPlayerSP, WorldClient, ItemStack, BlockPos, EnumFacing, Vec3d, EnumHand),
  EntityPlayer.damageShield(float),
  ForgeHooks.getContainerItem(ItemStack),
  PlayerInteractionManager.processRightClick(EntityPlayer, World, ItemStack, EnumHand),
  NetHandlerPlayServer#processPlayerBlockPlacement(CPacketPlayerTryUseItem)
  and NetHandlerPlayServer#processRightClickBlock(CPacketPlayerTryUseItemOnBlock).

  original contains the original ItemStack before the item was destroyed.
  (@link #hand) contains the hand that the current item was held in.

  This event is not Cancelable.

  This event does not have a result. HasResult

  This event is fired from ForgeEventFactory.onPlayerDestroyItem(EntityPlayer, ItemStack, EnumHand).
  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.player PlayerDestroyItemEvent]))

(defn ->player-destroy-item-event
  "Constructor.

  player - `net.minecraft.entity.player.EntityPlayer`
  original - `net.minecraft.item.ItemStack`
  hand - `net.minecraft.util.EnumHand`"
  (^PlayerDestroyItemEvent [^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.item.ItemStack original ^net.minecraft.util.EnumHand hand]
    (new PlayerDestroyItemEvent player original hand)))

(defn get-original
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^PlayerDestroyItemEvent this]
    (-> this (.getOriginal))))

(defn get-hand
  "returns: `net.minecraft.util.EnumHand`"
  (^net.minecraft.util.EnumHand [^PlayerDestroyItemEvent this]
    (-> this (.getHand))))

