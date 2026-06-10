// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelRuneSmith1Body extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer ancestor_r1;
	private final ModelRenderer cape;
	private final ModelRenderer LeftArm;
	private final ModelRenderer shoulder_left;
	private final ModelRenderer RightArm;
	private final ModelRenderer shoulder_right;

	public WFMModelRuneSmith1Body() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Body, 0.0F, 3.1416F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F, false));
		Body.cubeList.add(new ModelBox(Body, 16, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.8F, false));
		Body.cubeList.add(new ModelBox(Body, 19, 54, -5.0F, 9.0F, -3.5F, 10, 3, 7, 0.0F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 26, -3.5F, 7.0F, 3.5F, 7, 7, 0, -0.5F, false));

		ancestor_r1 = new ModelRenderer(this);
		ancestor_r1.setRotationPoint(0.0F, 10.5F, -4.5F);
		Body.addChild(ancestor_r1);
		setRotationAngle(ancestor_r1, -3.1416F, 0.0F, 3.1416F);
		ancestor_r1.cubeList.add(new ModelBox(ancestor_r1, 0, 26, -3.5F, -3.5F, -1.0F, 7, 7, 0, -0.5F, false));

		cape = new ModelRenderer(this);
		cape.setRotationPoint(0.0F, 0.0F, -5.0F);
		Body.addChild(cape);
		setRotationAngle(cape, -0.1309F, 0.0F, 0.0F);
		cape.cubeList.add(new ModelBox(cape, 40, 0, -6.0F, 0.0F, 0.0F, 12, 21, 0, 0.0F, false));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(6.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.89F, true));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 1.09F, true));

		shoulder_left = new ModelRenderer(this);
		shoulder_left.setRotationPoint(2.0F, -0.5F, 0.0F);
		LeftArm.addChild(shoulder_left);
		setRotationAngle(shoulder_left, 0.0F, 0.0F, 0.2182F);
		shoulder_left.cubeList.add(new ModelBox(shoulder_left, 0, 44, -2.75F, -2.5F, -3.5F, 6, 5, 7, 0.5F, true));
		shoulder_left.cubeList.add(new ModelBox(shoulder_left, 0, 32, -2.75F, -2.5F, -3.5F, 6, 5, 7, 0.3F, true));
		shoulder_left.cubeList.add(new ModelBox(shoulder_left, 44, 38, -2.75F, -4.5F, -4.5F, 1, 7, 9, 0.3F, true));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-6.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.89F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -3.0F, -2.0F, -2.0F, 4, 12, 4, 1.09F, false));

		shoulder_right = new ModelRenderer(this);
		shoulder_right.setRotationPoint(-2.0F, -0.5F, 0.0F);
		RightArm.addChild(shoulder_right);
		setRotationAngle(shoulder_right, 0.0F, 0.0F, -0.3054F);
		shoulder_right.cubeList.add(new ModelBox(shoulder_right, 0, 32, -3.25F, -2.7F, -3.5F, 6, 5, 7, 0.3F, false));
		shoulder_right.cubeList.add(new ModelBox(shoulder_right, 0, 44, -3.25F, -2.7F, -3.5F, 6, 5, 7, 0.5F, false));
		shoulder_right.cubeList.add(new ModelBox(shoulder_right, 44, 38, 2.0F, -4.5F, -4.5F, 1, 7, 9, 0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		LeftArm.render(f5);
		RightArm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}