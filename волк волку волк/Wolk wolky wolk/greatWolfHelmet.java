// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class greatWolfHelmet extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer wolf_head;
	private final ModelRenderer mouth;
	private final ModelRenderer ear_left;
	private final ModelRenderer ear_right;

	public greatWolfHelmet() {
		textureWidth = 64;
		textureHeight = 32;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -7.0F, -4.0F, 8, 8, 8, 0.5F, false));

		wolf_head = new ModelRenderer(this);
		wolf_head.setRotationPoint(0.0F, -5.0F, 0.0F);
		head.addChild(wolf_head);
		wolf_head.cubeList.add(new ModelBox(wolf_head, 32, 20, -4.0F, -7.0F, -4.0F, 8, 4, 8, 0.5F, false));

		mouth = new ModelRenderer(this);
		mouth.setRotationPoint(0.0F, -1.0F, -8.0F);
		wolf_head.addChild(mouth);
		mouth.cubeList.add(new ModelBox(mouth, 0, 21, -2.5F, -4.0F, -1.0F, 5, 6, 5, 0.5F, false));

		ear_left = new ModelRenderer(this);
		ear_left.setRotationPoint(4.0F, -8.0F, 1.0F);
		wolf_head.addChild(ear_left);
		setRotationAngle(ear_left, 0.0F, 0.1745F, 0.0F);
		ear_left.cubeList.add(new ModelBox(ear_left, 24, -7, 0.0F, -2.0F, -4.0F, 0, 4, 8, 0.0F, false));

		ear_right = new ModelRenderer(this);
		ear_right.setRotationPoint(-4.0F, -8.0F, 1.0F);
		wolf_head.addChild(ear_right);
		setRotationAngle(ear_right, 0.0F, -0.1745F, 0.0F);
		ear_right.cubeList.add(new ModelBox(ear_right, 24, -7, 0.0F, -2.0F, -4.0F, 0, 4, 8, 0.0F, false));
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