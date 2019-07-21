(ns net.minecraftforge.event.entity.minecart.MinecartInteractEvent
  "MinecartInteractEvent is fired when a player interacts with a minecart.
  This event is fired whenever a player interacts with a minecart in
  EntityMinecartContainer.processInitialInteract(EntityPlayer, EnumHand),
  EntityMinecartEmpty.processInitialInteract(EntityPlayer, EnumHand),
  EntityMinecartFurnace.processInitialInteract(EntityPlayer, EnumHand),
  EntityMinecartHopper.processInitialInteract(EntityPlayer, EnumHand),
  etc.

  player contains the EntityPlayer that is involved with this minecart interaction.

  This event is Cancelable.
  If this event is canceled, the player does not interact with the minecart.

  This event does not have a result. HasResult

  This event is fired on the MinecraftForge.EVENT_BUS."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.event.entity.minecart MinecartInteractEvent]))

(defn ->minecart-interact-event
  "Constructor.

  minecart - `net.minecraft.entity.item.EntityMinecart`
  player - `net.minecraft.entity.player.EntityPlayer`
  hand - `net.minecraft.util.EnumHand`"
  (^MinecartInteractEvent [^net.minecraft.entity.item.EntityMinecart minecart ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.util.EnumHand hand]
    (new MinecartInteractEvent minecart player hand)))

(defn get-player
  "returns: `net.minecraft.entity.player.EntityPlayer`"
  (^net.minecraft.entity.player.EntityPlayer [^MinecartInteractEvent this]
    (-> this (.getPlayer))))

(defn get-item
  "returns: `net.minecraft.item.ItemStack`"
  (^net.minecraft.item.ItemStack [^MinecartInteractEvent this]
    (-> this (.getItem))))

(defn get-hand
  "returns: `net.minecraft.util.EnumHand`"
  (^net.minecraft.util.EnumHand [^MinecartInteractEvent this]
    (-> this (.getHand))))

