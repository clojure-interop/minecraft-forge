(ns net.minecraftforge.client.event.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[net.minecraftforge.client.event.ClientChatReceivedEvent])
(require '[net.minecraftforge.client.event.DrawBlockHighlightEvent])
(require '[net.minecraftforge.client.event.EntityViewRenderEvent$CameraSetup])
(require '[net.minecraftforge.client.event.EntityViewRenderEvent$FOVModifier])
(require '[net.minecraftforge.client.event.EntityViewRenderEvent$FogColors])
(require '[net.minecraftforge.client.event.EntityViewRenderEvent$FogDensity])
(require '[net.minecraftforge.client.event.EntityViewRenderEvent$RenderFogEvent])
(require '[net.minecraftforge.client.event.EntityViewRenderEvent])
(require '[net.minecraftforge.client.event.FOVUpdateEvent])
(require '[net.minecraftforge.client.event.GuiOpenEvent])
(require '[net.minecraftforge.client.event.GuiScreenEvent$ActionPerformedEvent$Post])
(require '[net.minecraftforge.client.event.GuiScreenEvent$ActionPerformedEvent$Pre])
(require '[net.minecraftforge.client.event.GuiScreenEvent$ActionPerformedEvent])
(require '[net.minecraftforge.client.event.GuiScreenEvent$BackgroundDrawnEvent])
(require '[net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Post])
(require '[net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent$Pre])
(require '[net.minecraftforge.client.event.GuiScreenEvent$DrawScreenEvent])
(require '[net.minecraftforge.client.event.GuiScreenEvent$InitGuiEvent$Post])
(require '[net.minecraftforge.client.event.GuiScreenEvent$InitGuiEvent$Pre])
(require '[net.minecraftforge.client.event.GuiScreenEvent$InitGuiEvent])
(require '[net.minecraftforge.client.event.GuiScreenEvent$KeyboardInputEvent$Post])
(require '[net.minecraftforge.client.event.GuiScreenEvent$KeyboardInputEvent$Pre])
(require '[net.minecraftforge.client.event.GuiScreenEvent$KeyboardInputEvent])
(require '[net.minecraftforge.client.event.GuiScreenEvent$MouseInputEvent$Post])
(require '[net.minecraftforge.client.event.GuiScreenEvent$MouseInputEvent$Pre])
(require '[net.minecraftforge.client.event.GuiScreenEvent$MouseInputEvent])
(require '[net.minecraftforge.client.event.GuiScreenEvent$PotionShiftEvent])
(require '[net.minecraftforge.client.event.GuiScreenEvent])
(require '[net.minecraftforge.client.event.ModelBakeEvent])
(require '[net.minecraftforge.client.event.ModelRegistryEvent])
(require '[net.minecraftforge.client.event.MouseEvent])
(require '[net.minecraftforge.client.event.RenderBlockOverlayEvent$OverlayType])
(require '[net.minecraftforge.client.event.RenderBlockOverlayEvent])
(require '[net.minecraftforge.client.event.RenderGameOverlayEvent$BossInfo])
(require '[net.minecraftforge.client.event.RenderGameOverlayEvent$Chat])
(require '[net.minecraftforge.client.event.RenderGameOverlayEvent$ElementType])
(require '[net.minecraftforge.client.event.RenderGameOverlayEvent$Post])
(require '[net.minecraftforge.client.event.RenderGameOverlayEvent$Pre])
(require '[net.minecraftforge.client.event.RenderGameOverlayEvent$Text])
(require '[net.minecraftforge.client.event.RenderGameOverlayEvent])
(require '[net.minecraftforge.client.event.RenderHandEvent])
(require '[net.minecraftforge.client.event.RenderItemInFrameEvent])
(require '[net.minecraftforge.client.event.RenderLivingEvent$Post])
(require '[net.minecraftforge.client.event.RenderLivingEvent$Pre])
(require '[net.minecraftforge.client.event.RenderLivingEvent$Specials$Post])
(require '[net.minecraftforge.client.event.RenderLivingEvent$Specials$Pre])
(require '[net.minecraftforge.client.event.RenderLivingEvent$Specials])
(require '[net.minecraftforge.client.event.RenderLivingEvent])
(require '[net.minecraftforge.client.event.RenderPlayerEvent$Post])
(require '[net.minecraftforge.client.event.RenderPlayerEvent$Pre])
(require '[net.minecraftforge.client.event.RenderPlayerEvent$SetArmorModel])
(require '[net.minecraftforge.client.event.RenderPlayerEvent$Specials$Post])
(require '[net.minecraftforge.client.event.RenderPlayerEvent$Specials$Pre])
(require '[net.minecraftforge.client.event.RenderPlayerEvent$Specials])
(require '[net.minecraftforge.client.event.RenderPlayerEvent])
(require '[net.minecraftforge.client.event.RenderSpecificHandEvent])
(require '[net.minecraftforge.client.event.RenderTooltipEvent$Post])
(require '[net.minecraftforge.client.event.RenderTooltipEvent$PostBackground])
(require '[net.minecraftforge.client.event.RenderTooltipEvent$PostText])
(require '[net.minecraftforge.client.event.RenderTooltipEvent$Pre])
(require '[net.minecraftforge.client.event.RenderTooltipEvent])
(require '[net.minecraftforge.client.event.RenderWorldLastEvent])
(require '[net.minecraftforge.client.event.ScreenshotEvent])
(require '[net.minecraftforge.client.event.TextureStitchEvent$Post])
(require '[net.minecraftforge.client.event.TextureStitchEvent$Pre])
(require '[net.minecraftforge.client.event.TextureStitchEvent])