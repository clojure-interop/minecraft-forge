(ns net.minecraftforge.common.util.FakePlayer
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.common.util FakePlayer]))

(defn ->fake-player
  "Constructor.

  world - `net.minecraft.world.WorldServer`
  name - `com.mojang.authlib.GameProfile`"
  (^FakePlayer [^net.minecraft.world.WorldServer world ^com.mojang.authlib.GameProfile name]
    (new FakePlayer world name)))

(defn handle-client-settings
  "pkt - `net.minecraft.network.play.client.CPacketClientSettings`"
  ([^FakePlayer this ^net.minecraft.network.play.client.CPacketClientSettings pkt]
    (-> this (.handleClientSettings pkt))))

(defn get-position-vector
  "returns: `net.minecraft.util.math.Vec3d`"
  (^net.minecraft.util.math.Vec3d [^FakePlayer this]
    (-> this (.getPositionVector))))

(defn entity-invulnerable?
  "source - `net.minecraft.util.DamageSource`

  returns: `boolean`"
  (^Boolean [^FakePlayer this ^net.minecraft.util.DamageSource source]
    (-> this (.isEntityInvulnerable source))))

(defn add-stat
  "par-1-stat-base - `net.minecraft.stats.StatBase`
  par-2 - `int`"
  ([^FakePlayer this ^net.minecraft.stats.StatBase par-1-stat-base ^Integer par-2]
    (-> this (.addStat par-1-stat-base par-2))))

(defn on-update
  ""
  ([^FakePlayer this]
    (-> this (.onUpdate))))

(defn send-status-message
  "chat-component - `net.minecraft.util.text.ITextComponent`
  action-bar - `boolean`"
  ([^FakePlayer this ^net.minecraft.util.text.ITextComponent chat-component ^Boolean action-bar]
    (-> this (.sendStatusMessage chat-component action-bar))))

(defn on-death
  "source - `net.minecraft.util.DamageSource`"
  ([^FakePlayer this ^net.minecraft.util.DamageSource source]
    (-> this (.onDeath source))))

(defn can-attack-player?
  "player - `net.minecraft.entity.player.EntityPlayer`

  returns: `boolean`"
  (^Boolean [^FakePlayer this ^net.minecraft.entity.player.EntityPlayer player]
    (-> this (.canAttackPlayer player))))

(defn open-gui
  "Description copied from class: EntityPlayer

  mod - The mod trying to open a GUI - `java.lang.Object`
  mod-gui-id - GUI ID - `int`
  world - Current World - `net.minecraft.world.World`
  x - Passed directly to IGuiHandler, data meaningless Typically world X position - `int`
  y - Passed directly to IGuiHandler, data meaningless Typically world Y position - `int`
  z - Passed directly to IGuiHandler, data meaningless Typically world Z position - `int`"
  ([^FakePlayer this ^java.lang.Object mod ^Integer mod-gui-id ^net.minecraft.world.World world ^Integer x ^Integer y ^Integer z]
    (-> this (.openGui mod mod-gui-id world x y z))))

(defn can-use-command?
  "i - `int`
  s - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^FakePlayer this ^Integer i ^java.lang.String s]
    (-> this (.canUseCommand i s))))

(defn change-dimension
  "dim - `int`

  returns: `net.minecraft.entity.Entity`"
  (^net.minecraft.entity.Entity [^FakePlayer this ^Integer dim]
    (-> this (.changeDimension dim))))

