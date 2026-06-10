// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Доспех Гойдамира extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer head_r3;
	private final ModelRenderer head_r4;
	private final ModelRenderer head_r5;
	private final ModelRenderer head2;
	private final ModelRenderer body_r1;
	private final ModelRenderer RightArm;
	private final ModelRenderer head_r6;
	private final ModelRenderer head_r7;
	private final ModelRenderer head_r8;
	private final ModelRenderer head_r9;
	private final ModelRenderer head_r10;
	private final ModelRenderer head_r11;
	private final ModelRenderer head_r12;
	private final ModelRenderer LeftArm_r1;
	private final ModelRenderer LeftArm_r2;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RightArm_r1;
	private final ModelRenderer head_r13;
	private final ModelRenderer head_r14;
	private final ModelRenderer head_r15;
	private final ModelRenderer head_r16;
	private final ModelRenderer head_r17;
	private final ModelRenderer head_r18;
	private final ModelRenderer head_r19;
	private final ModelRenderer RightArm_r2;

	public Доспех Гойдамира() {
		textureWidth = 64;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.5F, false));
		Body.cubeList.add(new ModelBox(Body, 16, 0, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.8F, false));

		head_r1 = new ModelRenderer(this);
		head_r1.setRotationPoint(3.0F, 9.5F, -2.25F);
		Body.addChild(head_r1);
		setRotationAngle(head_r1, 0.4646F, -0.3376F, 0.2437F);
		head_r1.cubeList.add(new ModelBox(head_r1, 48, 60, -0.5F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		head_r2 = new ModelRenderer(this);
		head_r2.setRotationPoint(-3.0F, 12.5F, -2.25F);
		Body.addChild(head_r2);
		setRotationAngle(head_r2, 1.0869F, 0.9611F, 0.2976F);
		head_r2.cubeList.add(new ModelBox(head_r2, 48, 60, -1.0F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		head_r3 = new ModelRenderer(this);
		head_r3.setRotationPoint(-2.0F, 7.5F, -2.25F);
		Body.addChild(head_r3);
		setRotationAngle(head_r3, 0.5846F, 0.1694F, -0.2415F);
		head_r3.cubeList.add(new ModelBox(head_r3, 48, 60, -1.0F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		head_r4 = new ModelRenderer(this);
		head_r4.setRotationPoint(-3.0F, 6.5F, -2.25F);
		Body.addChild(head_r4);
		setRotationAngle(head_r4, 0.7684F, 0.7544F, 0.0336F);
		head_r4.cubeList.add(new ModelBox(head_r4, 48, 60, -1.0F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		head_r5 = new ModelRenderer(this);
		head_r5.setRotationPoint(4.0F, 10.5F, -2.25F);
		Body.addChild(head_r5);
		setRotationAngle(head_r5, 0.506F, 0.025F, -0.338F);
		head_r5.cubeList.add(new ModelBox(head_r5, 48, 60, -1.0F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(head2);
		setRotationAngle(head2, 0.0436F, 0.0F, 0.0F);
		

		body_r1 = new ModelRenderer(this);
		body_r1.setRotationPoint(0.0F, 0.0F, 3.0F);
		head2.addChild(body_r1);
		setRotationAngle(body_r1, 0.0436F, 0.0F, 0.0F);
		body_r1.cubeList.add(new ModelBox(body_r1, 5, 40, -6.0F, -1.0F, 0.05F, 12, 23, 0, 0.0F, false));

		RightArm = new ModelRenderer(this);
		RightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		RightArm.cubeList.add(new ModelBox(RightArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.49F, false));
		RightArm.cubeList.add(new ModelBox(RightArm, 0, 0, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.69F, false));

		head_r6 = new ModelRenderer(this);
		head_r6.setRotationPoint(-1.0F, -1.5F, 1.75F);
		RightArm.addChild(head_r6);
		setRotationAngle(head_r6, -1.0697F, -0.6614F, 0.8127F);
		head_r6.cubeList.add(new ModelBox(head_r6, 48, 60, -1.0F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		head_r7 = new ModelRenderer(this);
		head_r7.setRotationPoint(-1.0F, -1.5F, -1.25F);
		RightArm.addChild(head_r7);
		setRotationAngle(head_r7, 1.1273F, -0.4171F, -0.6388F);
		head_r7.cubeList.add(new ModelBox(head_r7, 48, 60, -1.0F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		head_r8 = new ModelRenderer(this);
		head_r8.setRotationPoint(-3.0F, 2.5F, -0.25F);
		RightArm.addChild(head_r8);
		setRotationAngle(head_r8, 0.2852F, -0.2307F, -0.7706F);
		head_r8.cubeList.add(new ModelBox(head_r8, 48, 60, -0.8F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		head_r9 = new ModelRenderer(this);
		head_r9.setRotationPoint(-2.0F, -1.5F, -0.25F);
		RightArm.addChild(head_r9);
		setRotationAngle(head_r9, -2.2909F, -0.4391F, 2.1448F);
		head_r9.cubeList.add(new ModelBox(head_r9, 48, 60, -1.0F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		head_r10 = new ModelRenderer(this);
		head_r10.setRotationPoint(-1.0F, -1.5F, -1.25F);
		RightArm.addChild(head_r10);
		setRotationAngle(head_r10, 0.5825F, 0.3178F, -0.2455F);
		head_r10.cubeList.add(new ModelBox(head_r10, 48, 60, -1.0F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		head_r11 = new ModelRenderer(this);
		head_r11.setRotationPoint(-1.0F, -2.5F, -1.25F);
		RightArm.addChild(head_r11);
		setRotationAngle(head_r11, -0.1368F, 0.2304F, -0.1734F);
		head_r11.cubeList.add(new ModelBox(head_r11, 48, 60, -1.0F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		head_r12 = new ModelRenderer(this);
		head_r12.setRotationPoint(-3.0F, 1.5F, -0.25F);
		RightArm.addChild(head_r12);
		setRotationAngle(head_r12, -0.2964F, -0.2144F, -0.4436F);
		head_r12.cubeList.add(new ModelBox(head_r12, 48, 60, -1.0F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		LeftArm_r1 = new ModelRenderer(this);
		LeftArm_r1.setRotationPoint(-1.2061F, 0.81F, 0.0F);
		RightArm.addChild(LeftArm_r1);
		setRotationAngle(LeftArm_r1, 0.0F, 0.0F, 0.0436F);
		LeftArm_r1.cubeList.add(new ModelBox(LeftArm_r1, 40, 0, -3.0F, -3.5F, -3.0F, 6, 7, 6, -0.15F, true));

		LeftArm_r2 = new ModelRenderer(this);
		LeftArm_r2.setRotationPoint(-1.0F, -0.5F, 0.0F);
		RightArm.addChild(LeftArm_r2);
		setRotationAngle(LeftArm_r2, 0.0F, 0.0F, -0.1309F);
		LeftArm_r2.cubeList.add(new ModelBox(LeftArm_r2, 40, 43, -3.25F, -2.5F, -3.0F, 6, 5, 6, 0.3F, true));
		LeftArm_r2.cubeList.add(new ModelBox(LeftArm_r2, 40, 32, -3.25F, -2.5F, -3.0F, 6, 5, 6, 0.1F, true));

		LeftArm = new ModelRenderer(this);
		LeftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		LeftArm.cubeList.add(new ModelBox(LeftArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.49F, true));
		LeftArm.cubeList.add(new ModelBox(LeftArm, 0, 0, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.69F, true));

		RightArm_r1 = new ModelRenderer(this);
		RightArm_r1.setRotationPoint(1.2061F, 0.81F, 0.0F);
		LeftArm.addChild(RightArm_r1);
		setRotationAngle(RightArm_r1, 0.0F, 0.0F, -0.0436F);
		RightArm_r1.cubeList.add(new ModelBox(RightArm_r1, 40, 0, -3.0F, -3.5F, -3.0F, 6, 7, 6, -0.15F, false));

		head_r13 = new ModelRenderer(this);
		head_r13.setRotationPoint(3.0F, 2.5F, -1.25F);
		LeftArm.addChild(head_r13);
		setRotationAngle(head_r13, 0.5387F, 0.7762F, 1.22F);
		head_r13.cubeList.add(new ModelBox(head_r13, 48, 60, -1.0F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		head_r14 = new ModelRenderer(this);
		head_r14.setRotationPoint(3.0F, 1.5F, -0.25F);
		LeftArm.addChild(head_r14);
		setRotationAngle(head_r14, -3.0414F, 1.2139F, -2.3775F);
		head_r14.cubeList.add(new ModelBox(head_r14, 48, 60, -1.0F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		head_r15 = new ModelRenderer(this);
		head_r15.setRotationPoint(1.0F, -1.5F, -0.25F);
		LeftArm.addChild(head_r15);
		setRotationAngle(head_r15, -3.0991F, 0.6043F, -2.4472F);
		head_r15.cubeList.add(new ModelBox(head_r15, 48, 60, -1.0F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		head_r16 = new ModelRenderer(this);
		head_r16.setRotationPoint(2.0F, -1.5F, -1.25F);
		LeftArm.addChild(head_r16);
		setRotationAngle(head_r16, 0.6772F, -0.5182F, -0.172F);
		head_r16.cubeList.add(new ModelBox(head_r16, 48, 60, -1.0F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		head_r17 = new ModelRenderer(this);
		head_r17.setRotationPoint(2.0F, -0.5F, -2.25F);
		LeftArm.addChild(head_r17);
		setRotationAngle(head_r17, 0.506F, 0.025F, -0.338F);
		head_r17.cubeList.add(new ModelBox(head_r17, 48, 60, -1.0F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		head_r18 = new ModelRenderer(this);
		head_r18.setRotationPoint(2.0F, -2.5F, -0.25F);
		LeftArm.addChild(head_r18);
		setRotationAngle(head_r18, -0.2444F, -0.3761F, 0.445F);
		head_r18.cubeList.add(new ModelBox(head_r18, 48, 60, -1.0F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		head_r19 = new ModelRenderer(this);
		head_r19.setRotationPoint(2.0F, -0.5F, 1.75F);
		LeftArm.addChild(head_r19);
		setRotationAngle(head_r19, -1.756F, -0.6686F, 2.2523F);
		head_r19.cubeList.add(new ModelBox(head_r19, 48, 60, -1.0F, -3.5F, 0.0F, 1, 3, 1, 0.0F, false));

		RightArm_r2 = new ModelRenderer(this);
		RightArm_r2.setRotationPoint(1.0F, -0.5F, 0.0F);
		LeftArm.addChild(RightArm_r2);
		setRotationAngle(RightArm_r2, 0.0F, 0.0F, 0.1309F);
		RightArm_r2.cubeList.add(new ModelBox(RightArm_r2, 40, 32, -2.75F, -2.5F, -3.0F, 6, 5, 6, 0.1F, false));
		RightArm_r2.cubeList.add(new ModelBox(RightArm_r2, 40, 43, -2.75F, -2.5F, -3.0F, 6, 5, 6, 0.3F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Body.render(f5);
		RightArm.render(f5);
		LeftArm.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}