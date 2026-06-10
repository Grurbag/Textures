// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelDickOnHead extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer overlay;
	private final ModelRenderer Dick;

	public WFMModelDickOnHead() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		overlay = new ModelRenderer(this);
		overlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(overlay);
		overlay.cubeList.add(new ModelBox(overlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		Dick = new ModelRenderer(this);
		Dick.setRotationPoint(0.0F, -8.0F, 0.0F);
		head.addChild(Dick);
		Dick.cubeList.add(new ModelBox(Dick, 0, 19, -4.0F, -13.0F, -1.0F, 8, 13, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}