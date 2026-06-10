// Made with Blockbench 4.2.5
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class custom_model extends ModelBase {
	private final ModelRenderer overlay;
	private final ModelRenderer head;
	private final ModelRenderer back_greben;
	private final ModelRenderer front_greben;
	private final ModelRenderer front_greben_r1;

	public custom_model() {
		textureWidth = 64;
		textureHeight = 32;

		overlay = new ModelRenderer(this);
		overlay.setRotationPoint(0.0F, 0.0F, 0.0F);
		overlay.cubeList.add(new ModelBox(overlay, 32, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F, false));

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F, false));

		back_greben = new ModelRenderer(this);
		back_greben.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.addChild(back_greben);
		back_greben.cubeList.add(new ModelBox(back_greben, 0, 16, -7.5F, -39.0F, 4.1F, 15, 13, 0, 0.0F, false));

		front_greben = new ModelRenderer(this);
		front_greben.setRotationPoint(0.0F, 24.0F, 0.0F);
		head.addChild(front_greben);
		

		front_greben_r1 = new ModelRenderer(this);
		front_greben_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		front_greben.addChild(front_greben_r1);
		setRotationAngle(front_greben_r1, -0.5672F, 0.0F, 0.0F);
		front_greben_r1.cubeList.add(new ModelBox(front_greben_r1, 4, 16, -3.5F, -31.5F, -20.0F, 7, 9, 0, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		overlay.render(f5);
		head.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}