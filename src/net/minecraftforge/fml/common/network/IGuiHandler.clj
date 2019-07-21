(ns net.minecraftforge.fml.common.network.IGuiHandler
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.common.network IGuiHandler]))

(defn get-server-gui-element
  "Returns a Server side Container to be displayed to the user.

  id - The Gui ID Number - `int`
  player - The player viewing the Gui - `net.minecraft.entity.player.EntityPlayer`
  world - The current world - `net.minecraft.world.World`
  x - X Position - `int`
  y - Y Position - `int`
  z - Z Position - `int`

  returns: A GuiScreen/Container to be displayed to the user, null if none. - `java.lang.Object`"
  (^java.lang.Object [^IGuiHandler this ^Integer id ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world ^Integer x ^Integer y ^Integer z]
    (-> this (.getServerGuiElement id player world x y z))))

(defn get-client-gui-element
  "Returns a Container to be displayed to the user. On the client side, this
   needs to return a instance of GuiScreen On the server side, this needs to
   return a instance of Container

  id - The Gui ID Number - `int`
  player - The player viewing the Gui - `net.minecraft.entity.player.EntityPlayer`
  world - The current world - `net.minecraft.world.World`
  x - X Position - `int`
  y - Y Position - `int`
  z - Z Position - `int`

  returns: A GuiScreen/Container to be displayed to the user, null if none. - `java.lang.Object`"
  (^java.lang.Object [^IGuiHandler this ^Integer id ^net.minecraft.entity.player.EntityPlayer player ^net.minecraft.world.World world ^Integer x ^Integer y ^Integer z]
    (-> this (.getClientGuiElement id player world x y z))))

