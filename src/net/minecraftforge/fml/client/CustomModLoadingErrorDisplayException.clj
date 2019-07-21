(ns net.minecraftforge.fml.client.CustomModLoadingErrorDisplayException
  "If a mod throws this exception during loading, it will be called back to render
  the error screen through the methods below. This error will not be cleared, and will
  not allow the game to carry on, but might be useful if your mod wishes to report
  a fatal configuration error in a pretty way.

  Throw this through a proxy. It won't work on the dedicated server environment."
  (:refer-clojure :only [require comment defn ->])
  (:import [net.minecraftforge.fml.client CustomModLoadingErrorDisplayException]))

(defn ->custom-mod-loading-error-display-exception
  "Constructor.

  message - `java.lang.String`
  cause - `java.lang.Throwable`"
  (^CustomModLoadingErrorDisplayException [^java.lang.String message ^java.lang.Throwable cause]
    (new CustomModLoadingErrorDisplayException message cause))
  (^CustomModLoadingErrorDisplayException []
    (new CustomModLoadingErrorDisplayException )))

(defn init-gui
  "Called after the GUI is initialized by the parent code. You can do extra stuff here, maybe?

  error-screen - The error screen we're painting - `net.minecraft.client.gui.GuiErrorScreen`
  font-renderer - A font renderer for you - `net.minecraft.client.gui.FontRenderer`"
  ([^CustomModLoadingErrorDisplayException this ^net.minecraft.client.gui.GuiErrorScreen error-screen ^net.minecraft.client.gui.FontRenderer font-renderer]
    (-> this (.initGui error-screen font-renderer))))

(defn draw-screen
  "Draw your error to the screen.

   Warning: Minecraft is in a deep error state. All it can do is stop.
   Do not try and do anything involving complex user interaction here.

  error-screen - The error screen to draw to - `net.minecraft.client.gui.GuiErrorScreen`
  font-renderer - A font renderer for you - `net.minecraft.client.gui.FontRenderer`
  mouse-rel-x - Mouse X - `int`
  mouse-rel-y - Mouse Y - `int`
  tick-time - tick time - `float`"
  ([^CustomModLoadingErrorDisplayException this ^net.minecraft.client.gui.GuiErrorScreen error-screen ^net.minecraft.client.gui.FontRenderer font-renderer ^Integer mouse-rel-x ^Integer mouse-rel-y ^Float tick-time]
    (-> this (.drawScreen error-screen font-renderer mouse-rel-x mouse-rel-y tick-time))))

(defn print-stack-trace
  "s - `net.minecraftforge.fml.common.EnhancedRuntimeException$WrappedPrintStream`"
  ([^CustomModLoadingErrorDisplayException this ^net.minecraftforge.fml.common.EnhancedRuntimeException$WrappedPrintStream s]
    (-> this (.printStackTrace s))))

