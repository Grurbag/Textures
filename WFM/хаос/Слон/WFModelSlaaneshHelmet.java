// Made with Blockbench 4.5.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer greben;
	private final ModelRenderer head_overlay;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		greben = new ModelRenderer(this);
		greben.setRotationPoint(0.0F, -8.0F, 0.0F);
		head.addChild(greben);
		greben.cubeList.add(new ModelBox(greben, 32, 5, 0.0F, -9.0F, -6.0F, 0, 11, 16, 0.0F, false));

		head_overlay = new ModelRenderer(this);
		head_overlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(head_overlay);
		head_overlay.cubeList.add(new ModelBox(head_overlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));
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