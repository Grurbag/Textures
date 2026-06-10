// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class WFMModelQueekHeadtakerBody extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer zabor;
	private final ModelRenderer skull_r1;
	private final ModelRenderer skull_r2;
	private final ModelRenderer pike_r1;
	private final ModelRenderer pike_r2;
	private final ModelRenderer pike_r3;
	private final ModelRenderer pike_r4;
	private final ModelRenderer pike_r5;
	private final ModelRenderer pike_r6;
	private final ModelRenderer pike_r7;
	private final ModelRenderer pike_r8;
	private final ModelRenderer pike_r9;
	private final ModelRenderer pike_r10;
	private final ModelRenderer pike_r11;
	private final ModelRenderer pike_r12;
	private final ModelRenderer pike_r13;
	private final ModelRenderer pike_r14;
	private final ModelRenderer leftArm;
	private final ModelRenderer rightArm;

	public WFMModelQueekHeadtakerBody() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 7.0F, -2.0F);
		setRotationAngle(Body, 0.3927F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -4.0F, -6.0F, -2.0F, 8, 12, 4, 0.5F, false));
		Body.cubeList.add(new ModelBox(Body, 0, 16, -4.0F, -6.0F, -2.0F, 8, 12, 4, 0.8F, false));

		zabor = new ModelRenderer(this);
		zabor.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(zabor);
		setRotationAngle(zabor, 0.1309F, 0.0F, 0.0F);
		zabor.cubeList.add(new ModelBox(zabor, 0, 17, 0.0F, -20.0F, 3.0F, 0, 24, 17, 0.0F, false));

		skull_r1 = new ModelRenderer(this);
		skull_r1.setRotationPoint(0.0F, -16.8192F, 19.4264F);
		zabor.addChild(skull_r1);
		setRotationAngle(skull_r1, -1.05F, -0.3352F, 0.5208F);
		skull_r1.cubeList.add(new ModelBox(skull_r1, 32, 0, -4.0F, -4.0F, -4.0F, 8, 8, 8, -1.5F, false));

		skull_r2 = new ModelRenderer(this);
		skull_r2.setRotationPoint(0.0F, 0.0F, 20.0F);
		zabor.addChild(skull_r2);
		setRotationAngle(skull_r2, -1.6093F, 0.2148F, -2.3603F);
		skull_r2.cubeList.add(new ModelBox(skull_r2, 32, 0, -4.0F, -4.0F, -4.0F, 8, 8, 8, -1.5F, false));

		pike_r1 = new ModelRenderer(this);
		pike_r1.setRotationPoint(-1.0F, 0.0F, 0.0F);
		zabor.addChild(pike_r1);
		setRotationAngle(pike_r1, 0.6545F, 0.0F, 0.0F);
		pike_r1.cubeList.add(new ModelBox(pike_r1, 15, 39, 0.5F, -2.0F, 2.0F, 1, 1, 24, 0.0F, false));

		pike_r2 = new ModelRenderer(this);
		pike_r2.setRotationPoint(-1.0F, 0.0F, 0.0F);
		zabor.addChild(pike_r2);
		setRotationAngle(pike_r2, 0.9163F, 0.0F, 0.0F);
		pike_r2.cubeList.add(new ModelBox(pike_r2, 19, 43, 0.5F, -2.0F, 2.0F, 1, 1, 20, 0.0F, false));

		pike_r3 = new ModelRenderer(this);
		pike_r3.setRotationPoint(-1.0F, 0.0F, 10.0F);
		zabor.addChild(pike_r3);
		setRotationAngle(pike_r3, 0.48F, 0.0F, 0.0F);
		pike_r3.cubeList.add(new ModelBox(pike_r3, 25, 0, 0.0F, -9.0F, 5.0F, 2, 6, 1, 0.0F, false));

		pike_r4 = new ModelRenderer(this);
		pike_r4.setRotationPoint(-1.0F, -5.0F, 8.0F);
		zabor.addChild(pike_r4);
		setRotationAngle(pike_r4, 0.5672F, 0.0F, 0.0F);
		pike_r4.cubeList.add(new ModelBox(pike_r4, 25, 0, 0.01F, -7.0F, 5.0F, 2, 5, 1, 0.0F, false));

		pike_r5 = new ModelRenderer(this);
		pike_r5.setRotationPoint(-1.0F, 0.0F, 9.0F);
		zabor.addChild(pike_r5);
		setRotationAngle(pike_r5, 0.3491F, 0.0F, 0.0F);
		pike_r5.cubeList.add(new ModelBox(pike_r5, 25, 8, -0.01F, -4.0F, 5.0F, 2, 3, 1, 0.0F, false));

		pike_r6 = new ModelRenderer(this);
		pike_r6.setRotationPoint(-1.0F, 0.0F, 8.0F);
		zabor.addChild(pike_r6);
		setRotationAngle(pike_r6, -0.1309F, 0.0F, 0.0F);
		pike_r6.cubeList.add(new ModelBox(pike_r6, 25, 8, 0.01F, -4.0F, 5.0F, 2, 3, 1, 0.0F, false));

		pike_r7 = new ModelRenderer(this);
		pike_r7.setRotationPoint(-1.0F, 0.0F, 7.0F);
		zabor.addChild(pike_r7);
		setRotationAngle(pike_r7, -0.5236F, 0.0F, 0.0F);
		pike_r7.cubeList.add(new ModelBox(pike_r7, 25, 8, 0.0F, -4.0F, 5.0F, 2, 6, 1, 0.0F, false));

		pike_r8 = new ModelRenderer(this);
		pike_r8.setRotationPoint(-1.0F, -1.0F, 4.0F);
		zabor.addChild(pike_r8);
		setRotationAngle(pike_r8, 1.1345F, 0.0F, 0.0F);
		pike_r8.cubeList.add(new ModelBox(pike_r8, 58, 0, 0.01F, -4.0F, 5.0F, 2, 2, 1, 0.0F, false));

		pike_r9 = new ModelRenderer(this);
		pike_r9.setRotationPoint(-1.0F, 0.0F, 4.0F);
		zabor.addChild(pike_r9);
		setRotationAngle(pike_r9, 0.829F, 0.0F, 0.0F);
		pike_r9.cubeList.add(new ModelBox(pike_r9, 58, 0, 0.0F, -5.0F, 5.0F, 2, 3, 1, 0.0F, false));

		pike_r10 = new ModelRenderer(this);
		pike_r10.setRotationPoint(-1.0F, 0.0F, 2.0F);
		zabor.addChild(pike_r10);
		setRotationAngle(pike_r10, 0.3491F, 0.0F, 0.0F);
		pike_r10.cubeList.add(new ModelBox(pike_r10, 33, 0, -0.01F, -4.0F, 5.0F, 2, 3, 1, 0.0F, false));

		pike_r11 = new ModelRenderer(this);
		pike_r11.setRotationPoint(-1.0F, 0.0F, 1.0F);
		zabor.addChild(pike_r11);
		setRotationAngle(pike_r11, -0.1309F, 0.0F, 0.0F);
		pike_r11.cubeList.add(new ModelBox(pike_r11, 33, 0, 0.01F, -4.0F, 5.0F, 2, 3, 1, 0.0F, false));

		pike_r12 = new ModelRenderer(this);
		pike_r12.setRotationPoint(-1.0F, 0.0F, 0.0F);
		zabor.addChild(pike_r12);
		setRotationAngle(pike_r12, -0.5236F, 0.0F, 0.0F);
		pike_r12.cubeList.add(new ModelBox(pike_r12, 33, 0, 0.0F, -4.0F, 5.0F, 2, 3, 1, 0.0F, false));
		pike_r12.cubeList.add(new ModelBox(pike_r12, 26, 50, 0.5F, -2.0F, 2.0F, 1, 1, 13, 0.0F, false));

		pike_r13 = new ModelRenderer(this);
		pike_r13.setRotationPoint(-1.0F, 0.0F, 0.0F);
		zabor.addChild(pike_r13);
		setRotationAngle(pike_r13, -0.0873F, 0.0F, 0.0F);
		pike_r13.cubeList.add(new ModelBox(pike_r13, 23, 47, 0.5F, -2.0F, 2.0F, 1, 1, 16, 0.0F, false));

		pike_r14 = new ModelRenderer(this);
		pike_r14.setRotationPoint(-1.0F, 0.0F, 0.0F);
		zabor.addChild(pike_r14);
		setRotationAngle(pike_r14, 0.2618F, 0.0F, 0.0F);
		pike_r14.cubeList.add(new ModelBox(pike_r14, 21, 45, 0.5F, -2.0F, 2.0F, 1, 1, 18, 0.0F, false));

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(4.0F, 4.0F, -4.0F);
		leftArm.cubeList.add(new ModelBox(leftArm, 46, 16, 0.0F, -2.0F, -2.0F, 4, 6, 4, 0.49F, false));
		leftArm.cubeList.add(new ModelBox(leftArm, 46, 39, 0.0F, -2.0F, -2.0F, 4, 6, 4, 0.69F, false));
		leftArm.cubeList.add(new ModelBox(leftArm, 46, 26, 0.0F, 3.0F, -2.0F, 4, 9, 4, -0.1F, false));
		leftArm.cubeList.add(new ModelBox(leftArm, 48, 49, 0.0F, 3.0F, -2.0F, 4, 9, 4, 0.29F, false));

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-4.0F, 4.0F, -4.0F);
		rightArm.cubeList.add(new ModelBox(rightArm, 46, 16, -4.0F, -2.0F, -2.0F, 4, 6, 4, 0.49F, true));
		rightArm.cubeList.add(new ModelBox(rightArm, 46, 26, -4.0F, 3.0F, -2.0F, 4, 9, 4, -0.1F, true));
		rightArm.cubeList.add(new ModelBox(rightArm, 46, 39, -4.0F, -2.0F, -2.0F, 4, 6, 4, 0.69F, true));
		rightArm.cubeList.add(new ModelBox(rightArm, 48, 49, -4.0F, 3.0F, -2.0F, 4, 9, 4, 0.29F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		leftArm.render(f5);
		rightArm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}